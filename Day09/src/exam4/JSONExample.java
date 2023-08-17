package exam4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONExample {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("member.json", Charset.forName("UTF-8")));
		String json = br.readLine();
		br.close();
		
		//JSON 파싱
		JSONObject root = new JSONObject(json);
		
		//속성 정보 읽기
		System.out.println("id : " + root.getString("id"));
		System.out.println("name : " + root.getString("name"));
		System.out.println("age : " + root.getInt("age"));
		System.out.println("student : " + root.getBoolean("student"));
		
		//객체 속성 정보 읽기
		JSONObject tel = root.getJSONObject("tel");
		System.out.println("home : " + tel.getString("home"));
		System.out.println("mobile : " + tel.getString("mobile"));
		
		//배열 속성 정보 읽기
		JSONArray skill = root.getJSONArray("skill");
		System.out.println("skill : ");
		for(int i=0; i<skill.length(); i++) {
			System.out.println(skill.get(i) + ", ");
		}
				
	}
}