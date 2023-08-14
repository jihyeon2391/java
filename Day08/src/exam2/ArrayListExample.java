package exam2;
import java.util.ArrayList;
import java.util.List;

class Board {
	private String subject;
	private String content;
	private String writer;
	
	
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getContent() {
		return content;
	}


	
	public void setContent(String content) {
		this.content = content;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}

	
}


public class ArrayListExample {

	public static void main(String[] args) {
		
		//제너릭 타입
		List<Board> list = new ArrayList<>();
		
		
		
		Board board1 = new Board("제목1", "내용1", "작성자1");
		list.add(board1);
		Board board2 = new Board("제목2", "내용2", "작성자2");
		list.add(board2);
		Board board3 = new Board("제목3", "내용3", "작성자3");
		list.add(board3);
		Board board4 = new Board("제목4", "내용4", "작성자4");
		list.add(board4);
		Board board5 = new Board("제목5", "내용5", "작성자5");
		list.add(board5);
		
		//리스트에 저장된 게시물 수 얻어오기
		int n = list.size();
		System.out.println("총 객체 수 : " + n);
		
		//특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		
		System.out.println();
		
		//모든 객체를 하나씩 가져오기
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		
		System.out.println();
		
		//객체 삭제
		list.remove(2);
		
		
		//for-each문
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
	}

}
