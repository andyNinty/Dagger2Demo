package andy.lee.daggerdemo;

import dagger.Component;

/**
 * andy.lee.daggerdemo
 * Created by andy on 17-1-18.
 */

//用@Component表示这个接口是一个连接器，只有interface或者抽象类能用@Component注解
//这里表示Component会从MainModule类中拿那些用@Provides注解的方法来生成需要注入的实例
@Component(modules = MainModule.class)
public interface MainComponent {


    /**
     * 需要用到这个连接器的对象，就是这个对象里面有需要注入的属性
     * （被标记为@Inject的属性）
     * 这里inject表示注入的意思，这个方法名可以随意更改，但建议就用inject。
     */
    void inject(MainActivity activity);
}
