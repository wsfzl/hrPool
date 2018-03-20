package org.hr.utils;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;


import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class TestFreeMaker {



	@Test
	public void test() throws Exception {
		//1,准备模型数据
		Map<String, Object> model = new HashMap<>();
		model.put("name", "李总");
		
		//用map来模拟实体类
		Map<String, Object> computer = new HashMap<>();
		computer.put("brand", "iPhone");
		model.put("computer", computer);
		
		//读取模板文件
		
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
		configuration.setDirectoryForTemplateLoading(new File("src/test/resources"));
		
		Template template = configuration.getTemplate("demo.ftl");
		
		//使用freemarker合成
		//Writer out = new OutputStreamWriter(System.out); 
		Writer out = new OutputStreamWriter(new FileOutputStream(new File("C:Users/asus/Desktop/demo1.html"))); 
		template.process(model, out);
		System.out.println("成功！");
		
	}

}
