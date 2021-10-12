package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
	private int idx; //댓글 번호
	private int writingIdx; //글 번호
	private String userId; //유저 아이디
	private String content; //댓글 내용
}
