
/**  
* @Title: DemoTest.java  
* @Package Demo1  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author liuqing-pc  
* @date 2018��12��25��  
* @version V1.0  
*/
package Demo1;


/**  
* @ClassName: DemoTest  
* @Description: TODO(������һ�仰��������������)  
* @author liuqing-pc  
* @date 2018��12��25��  
*    
*/
public class DemoTest {

	/**  
	* @Title: main  
	* @Description: TODO(������һ�仰�����������������)  
	* @param @param args    ����  
	* @return void    ��������  
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double PI = 3.1415;  //����final �ؼ��� ���ε����Բ��ܱ��̳кͶ������á������������ͱ�����ֵ���ܱ��޸�
		//final�������������಻���޸������������͵ĵ�ֵַ���������е����Կ��Ա��޸�
		
		final PrintDemo pDemo = new PrintDemo();
		/**pDemo = new PrintDemo();
		 * xception in thread "main" java.lang.Error: Unresolved compilation problem:
		*The final local variable pDemo cannot be assigned. It must be blank and not using a compound assignment
		*���룺
		*�̡߳�main��java.lang�е�xception������:δ����ı�������:
		*�޷��������յı��ر���pDemo���������ǿհ׵ģ�����ʹ�ø��ϸ�ֵ
		*ԭ��
		*final���εĶ����ֵַ���ܱ��ı�
		 * */
		pDemo.setName("����");
		pDemo.setAge(19);
		pDemo.setStature(170);
		System.out.println(pDemo.toString());
		
	}

}
