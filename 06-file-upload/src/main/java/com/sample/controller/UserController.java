package com.sample.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.xml.soap.SAAJResult;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {


    /**
     * 传统文件上传方式
     */
    @RequestMapping("/fileUpload1")
    public String fileUpload1(HttpServletRequest request) throws Exception {

        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        // 解析request
        List<FileItem> fileItems = upload.parseRequest(request);

        for (FileItem item: fileItems){
            // 判断，当前item是不是上传的文件
            if (item.isFormField()){
                // 说明是普通的表单项
            } else {
                // 是上传的文件
                // 生成文件唯一名
                String uuid = UUID.randomUUID().toString().replace("-", "");
                // 获取上传的文件名
                String name = uuid + "_" + item.getName();
                item.write(new File(path, name));
                item.delete();  // 清除内存
            }
        }

        System.out.println("文件上传成功...");
        return "success";
    }

    /**
     * Spring方式上传文件
     */
    @RequestMapping("/fileUpload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile upload) throws IOException {
        // 获取文件上传路径
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        // 若路径文件夹不存在，则创建一个
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        // TODO: figure out what is the output of 'getName()'
        // 获取表单的文件，类型为Spring文件解析器的 MultipartFile，变量名要和表单的name属性一样
        String name = upload.getOriginalFilename();
        // 获取文件的唯一uuid
        String uuid = UUID.randomUUID().toString().replace("-", "");
        // 构造新的文件名
        String filename = uuid + "_" + name;
        // 文件保存，特有方法
        upload.transferTo(new File(path, filename));

        System.out.println("文件上传成功...");

        return "success";
    }


    @RequestMapping("/fileUpload3")
    public String fileUpload3(MultipartFile upload) throws IOException {
        // 定义文件上传服务器的路径
        String path = "http://localhost:9090/file_upload_server/uploads/";

        // TODO: figure out what is the output of 'getName()'
        // 获取表单的文件，类型为Spring文件解析器的 MultipartFile，变量名要和表单的name属性一样
        String name = upload.getOriginalFilename();
        // 获取文件的唯一uuid
        String uuid = UUID.randomUUID().toString().replace("-", "");
        // 构造新的文件名
        String filename = uuid + "_" + name;

        // 创建客户端对象
        Client client = Client.create();
        // 连接服务器
        WebResource webResource = client.resource(path + filename);
        // 上传文件
        webResource.put(upload.getBytes());

        System.out.println("文件上传成功...");

        return "success";
    }

}
