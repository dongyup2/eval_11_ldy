package vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookVO {
	private int bcode;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String binfo;

	public BookVO toEntity() {
		return BookVO.builder()
				.title(title)
				.author(author)
				.publisher(publisher)
				.price(price)
				.binfo(binfo)
				.build();
	}
}
