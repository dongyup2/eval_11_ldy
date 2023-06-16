package vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserVO {
	private String id;
	private String pw;
	private String name;
}
