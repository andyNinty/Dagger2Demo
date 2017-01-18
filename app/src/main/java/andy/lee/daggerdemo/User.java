package andy.lee.daggerdemo;

import javax.inject.Inject;

/**
 * andy.lee.daggerdemo
 * Created by andy on 17-1-18.
 */

public class User {
    private String name;

    // 用Inject标记构造函数,表示用它来注入到目标对象中去
    //只能注解其中一个构造函数，不能注解多个构造函数。
    @Inject
    public User() {
        name = "我是andy";
    }

    public String getName() {
        return name;
    }
}
