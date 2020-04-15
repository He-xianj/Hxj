package com._5.test._3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 5、	新建一个“春江花月夜.txt”文件（手动新建），把该文件剪贴到D盘下。
 * */
public class Cun {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//创建
			File f=new File("D:\\春江花月夜.txt");
			
			if(f.exists()) {
				FileWriter fw=new FileWriter(f);
				//写
				fw.write("春江花月夜 \r\n" + 
						"作者：张若虚\r\n" + 
						"春江潮水连海平，海上明月共潮生。\r\n" + 
						"滟滟随波千万里，何处春江无月明！\r\n" + 
						"江流宛转绕芳甸，月照花林皆似霰；\r\n" + 
						"空里流霜不觉飞，汀上白沙看不见。\r\n" + 
						"江天一色无纤尘，皎皎空中孤月轮。\r\n" + 
						"江畔何人初见月？江月何年初照人？\r\n" + 
						"人生代代无穷已，江月年年望相似。\r\n" + 
						"不知江月待何人，但见长江送流水。\r\n" + 
						"白云一片去悠悠，青枫浦上不胜愁。\r\n" + 
						"谁家今夜扁舟子？何处相思明月楼？\r\n" + 
						"可怜楼上月徘徊，应照离人妆镜台。\r\n" + 
						"玉户帘中卷不去，捣衣砧上拂还来。\r\n" + 
						"此时相望不相闻，愿逐月华流照君。\r\n" + 
						"鸿雁长飞光不度，鱼龙潜跃水成文。\r\n" + 
						"昨夜闲潭梦落花，可怜春半不还家。\r\n" + 
						"江水流春去欲尽，江潭落月复西斜。\r\n" + 
						"斜月沉沉藏海雾，碣石潇湘无限路。\r\n" + 
						"不知乘月几人归，落月摇情满江树。");
				System.out.println("成功");
				//关
				fw.close();
			}else {
			System.out.println("文件不存在");
			}
			System.out.println("over");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
