package lession1;

public class ChuanHoaChuoi {
	
		public String str;
      
        public void chuanHoaChuoi() {
        	String s = this.str; 
        	
        	System.out.print("Chuỗi sau khi chuẩn hóa: ");
        	//Loại bỏ khoảng trắng thừa đầu và cuối chuỗi
            s = s.trim();
            
            //Loại bỏ khoảng trắng thừa ở giữa chuỗi
            while (s.indexOf("  ") != -1) s = s.replaceAll("  "," ");

            //Viết hoa các chữ cái đầu mỗi từ và viết thường các chữ cái còn lại
            System.out.print(String.valueOf(s.charAt(0)).toUpperCase());
            for(int i=1; i<s.length(); i++) {
                if( (s.charAt(i) != ' ') && (s.charAt(i-1) == ' ') )
                    System.out.print(String.valueOf(s.charAt(i)).toUpperCase());
                else
               	 System.out.print(String.valueOf(s.charAt(i)).toLowerCase());
            }
          
        }
}
