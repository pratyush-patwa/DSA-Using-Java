package singlyLinkedList;

public class TestLinkedList {
	public static void main(String[] args){

		LinkedList list = new LinkedList();

				list.insertAtStart(4);
				list.insertAtStart(3);
				list.insertAtStart(2);
				System.out.println("------------List-----------------");
				list.print(); 
				System.out.println();

				list.insertAtEnd(14);
				list.insertAtEnd(13);
				list.insertAtEnd(12);
				
				System.out.println();
				System.out.println("------------New List-----------------");
				list.print(); 
				
				System.out.println();
				
				try{
					list.remove(13);
				}catch(Exception e) {}
				try{
					list.remove( 2);
				}catch(Exception e) {}
			
				System.out.println();
				System.out.println("------------New List-----------------");
				list.print(); 
				System.out.println();
				list.insertAtIndex(2, 20);
				list.insertAtIndex(4, 40);
				System.out.println();
				System.out.println("------------New List-----------------");
				list.print(); 
	}
}
