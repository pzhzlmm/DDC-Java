import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	@Test
	public void test1(){
		List list = Arrays.asList(43,65,67,43,6,34,78,34,15,8);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
//		Collections.sort(list,new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				Integer i1 = (Integer)o1;
//				Integer i2 = (Integer)o2;
//				return 0;
//			}
//			return 0;
//
//		});
		Collections.swap(list, 1, 2);
		System.out.println(list);
		System.out.println(Collections.max(list));
		int frequency = Collections.frequency(list, 34);
		System.out.println(frequency);
		//?????��??
//		ArrayList dest = new ArrayList();
//		Collections.copy(dest, list);
//		ArrayList dest = Arrays.asList(new Object[30]);
//		Collections.copy(dest, list);
		
//		Collections.synchronizedList(list)
	}
}
