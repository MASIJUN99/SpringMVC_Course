## 演示注解

### @RequestParam

把请求中指定名称的参数传给控制器函数

属性：
1. value：请求中参数的名称
2. required：请求中是否必须包含该参数否则报错

注意：我有一点没解决，如果我要输入Student对象中name的参数，我可不可以直接把对象放在方法的属性中。


例如

```Java
// TODO: to fix this problem
public String testRequestParam(@RequestParam(value="name", required = true) Student student){...}
```