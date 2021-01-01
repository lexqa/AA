package core;

import java.time.LocalDateTime;

public class Mane
{
	static String exp = "2020-10-07T00:03:39.901";//System.out.println(LocalDateTime.now());
    static String authorized_user = "Lex";
    static String username = System.getProperty("username"); // -Dusername="alex"
    
	public static void main( String[] args )
    {
		
	if (!username.equalsIgnoreCase(authorized_user)) {
	String msg = String.format("Username [%s] is not authorized run this program.", username); throw new RuntimeException(msg);}

  if (LocalDateTime.now().isAfter(LocalDateTime.parse(exp))) {
  String msg = String.format("Today at [%s] this version has expired.", LocalDateTime.now());
  throw new RuntimeException(msg);}
  //System.out.println(LocalDateTime.now());
   System.out.println( "Successefully" );
    }
}
