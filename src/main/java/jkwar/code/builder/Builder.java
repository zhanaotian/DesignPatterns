package jkwar.code.builder;

//抽象 Builder 类
public abstract class Builder {
	// 设置主机
	public abstract Builder buildBoard(String board);

	// 设置显示器
	public abstract Builder buildDisplay(String displau);

	// 设置操作系统
	public abstract Builder buildOS();

	// 创建 Computer
	public abstract Computer create();
}
