package snakecamel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUnitTest {

	@Test
	public void snakeToCamelcaseでabc_def_ghiのキャメルケースを取得できる() {
		SnakeCamelUtil sn=new SnakeCamelUtil();
		String expected ="AbcDefGhi";
		String actual=sn.snakeToCamelcase("abc_def_ghi");
		assertThat(actual,is(expected));

	}

	@Test
	public void snakeToCamelcaseでapple_pieのキャメルケースを取得できる() {
		SnakeCamelUtil sn=new SnakeCamelUtil();
		String expected ="ApplePie";
		String actual=sn.snakeToCamelcase("apple_pie");
		assertThat(actual,is(expected));

	}

	@Test
	public void camelToSnakecaseでChocolateBananaのキャメルケースを取得できる() {
		SnakeCamelUtil sn=new SnakeCamelUtil();
		String expected ="chocolate_banana";
		String actual=sn.camelToSnakecase("ChocolateBanana");
		assertThat(actual,is(expected));

	}

	@Test
	public void camelToSnakecaseでDogCatRabitのキャメルケースを取得できる() {
		SnakeCamelUtil sn=new SnakeCamelUtil();
		String expected ="dog_cat_rabit";
		String actual=sn.camelToSnakecase("DogCatRabit");
		assertThat(actual,is(expected));

	}

}
