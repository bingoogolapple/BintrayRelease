package cn.bingoogolapple.bintrayrelease;

import android.support.v7.widget.RecyclerView;

import cn.bingoogolapple.bgabanner.BGABanner;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:15/11/28 下午8:22
 * 描述:
 */
public class TestJCenterClass {

    /**
     * 计算两个整型的和
     *
     * @param number1 参数1
     * @param number2 参数2
     * @return 两个参数的和
     */
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * 测试中文
     *
     * @return
     */
    public String getChinese() {
        RecyclerView recyclerView;
        BGABanner banner;
        return "测试返回中文";
    }
}