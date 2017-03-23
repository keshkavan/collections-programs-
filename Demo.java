
// ConcurrentHashMap
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
class Demo
{
  public static void main(String args[])
  {
     ConcurrentHashMap< String,Integer> id=new ConcurrentHashMap();
	 id.put("A",101);
	 id.put("B",102);
	 id.put("C",103);
	 id.put("D",104);
	 id.put("E",105);
	 for(Map.Entry m:id.entrySet())
        System.out.println(m.getKey()+"  "+m.getValue());
  }

}