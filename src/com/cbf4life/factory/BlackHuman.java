package com.cbf4life.factory;

/**
 * @author cbf4Life cbf4life@126.com
 *         I'm glad to share my knowledge with you all.
 *         黑色人种，记得中学学英语，老师说black man是侮辱人的意思，不懂，没跟老外说话
 */
public class BlackHuman implements Human {
    public void cry() {
        System.out.println("黑人会哭");

    }

    public void laugh() {
        System.out.println("黑人会笑");
    }

    public void talk() {
        System.out.println("黑人可以说话，一般人听不懂");
    }
}