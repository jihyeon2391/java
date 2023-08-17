package exam4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJSONExample {
	public static void main(String[] args) throws IOException {
		//JSON 객체 생성
		JSONObject root = new JSONObject();
		
		//속성 추가
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", 25);
		root.put("student", true);
		
		//객체 송석 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "123123");
		tel.put("mobile", "123123123");
		root.put("tel", tel);
		
		//배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		root.put("skill", skill);
		
		//JSON 얻기
		String json = root.toString();
		
		//콘솔에 출력
		System.out.println(json);
		
		//파일로 저장
		Writer writer = new FileWriter("member.json", Charset.forName("UTF-8"));
		writer.write(json);
		writer.flush();
		writer.close();
	}

}
