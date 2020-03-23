package ex3;
/**  
 * @Title:  Student.java   
 * @Package    
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午9:26:10   
 * @version V1.0 
 */

/**   
 * @ClassName:  Student   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 下午9:26:10   
 *     
 */
public class Student {
	int id;
	int score;
	/**
	 * @return the name
	 */
	public int getName() {
		return id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(int name) {
		this.id = name;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @param name
	 * @param score
	 */
	public Student(int name, int score) {
		super();
		this.id = name;
		this.score = score;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + id + ", score=" + score + "]";
	}
	
}
