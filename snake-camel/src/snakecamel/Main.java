package snakecamel;



	import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

	public class Main {
		@Test
		public void capitalizeでaのキャメルケースを得ることができる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="A";
			String actual=sn.capitalize("a");
			assertThat(actual,is(expected));
		}

		@Test
		public void capitalizeでxyzのキャメルケースを得ることができる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="Xyz";
			String actual=sn.capitalize("xyz");
			assertThat(actual,is(expected));
		}

		@Test
		public void uncapitalizeでAのスネイクケースを得ることができる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="a";
			String actual=sn.uncapitalize("A");
			assertThat(actual,is(expected));
		}

		@Test
		public void uncapitalizeでXyzのスネイクケースを得ることができる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="xyz";
			String actual=sn.uncapitalize("Xyz");
			assertThat(actual,is(expected));
		}

		@Test
		public void snakeToCamelcaseでabcのキャメルケースを取得できる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="Abc";
			String actual=sn.snakeToCamelcase("abc");
			assertThat(actual,is(expected));

		}

		@Test
		public void snakeToCamelcaseでabc_defのキャメルケースを取得できる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="AbcDef";
			String actual=sn.snakeToCamelcase("abc_def");
			assertThat(actual,is(expected));

		}

		@Test
		public void snakeToCamelcaseでabc_def_ghのキャメルケースを取得できる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="AbcDefGh";
			String actual=sn.snakeToCamelcase("abc_def_gh");
			assertThat(actual,is(expected));

		}
		@Test
		public void snakeToCamelcaseでabc__def__ghのキャメルケースを取得できる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="AbcDefGh";
			String actual=sn.snakeToCamelcase("abc__def__gh");
			assertThat(actual,is(expected));

		}

		@Test
		public void snakeToCamelcaseで_abc_def_のキャメルケースを取得できる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="AbcDef";
			String actual=sn.snakeToCamelcase("_abc_def_");
			assertThat(actual,is(expected));

		}

		@Test
		public void camelToSnakecaseでAbcのスネイクケースを取得できる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="abc";
			String actual=sn.camelToSnakecase("Abc");
			assertThat(actual,is(expected));

		}

		@Test
		public void camelToSnakecaseでAbcDefのスネイクケースを取得できる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="abc_def";
			String actual=sn.camelToSnakecase("AbcDef");
			assertThat(actual,is(expected));

		}

		@Test
		public void camelToSnakecaseでAbcDefGhのスネイクケースを取得できる() {
			SnakeCamelUtil sn=new SnakeCamelUtil();
			String expected ="abc_def_gh";
			String actual=sn.camelToSnakecase("AbcDefGh");
			assertThat(actual,is(expected));

		}

}
