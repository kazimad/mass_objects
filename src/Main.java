/**
 * Created by KaZimad on 24.02.14.
 */
public class Main{

    public static class Elem{
        int number = 0;
        Elem link = null;

    }
    public static class MyArray{
        Elem head;
        Elem tail;
        int count =0;

        public void add (int ins){   // добавление елемента тут
            Elem a = new Elem();
            a.number = ins;
            if (tail == null){   // выполняется единожды при добавление первого елемента.
                head = a;
                tail = a;
                count++;
            }
            else {tail.link = a;
                tail = a;
                count++;}

        }
        void print (){
            Elem t = new Elem();
            t =  head ;
            while (t !=null){
                System.out.println(t.number );
                t = t.link;
            }
        }
        void del(int delEl){
            if (head == null){  /// нечего удалять, елементов нет
                count --;
                return;
            }
            if ( head == tail){
                head = null;    // если один елемент
                tail = null;
                count --;
                return;
            }
            if (head.number == delEl){
                head = head.link;
                count --;
                return;
            }


            Elem q = new Elem();
            q=head;
            while (q.link != null){
                if (q.link.number == delEl ){
                    if (q.link == tail){
                        tail = q;
                    }
                    q.link=q.link.link;
                    count --;
                    return;
                }
                q=q.link;
            }
        }

        void length (){
            System.out.println(count);
        }

        void getElem(int get){
            Elem q = new Elem();
            q=head;
            while (q.link !=null){
                if (q.link.number == get){
                    System.out.println(q.link.number);
                }
                q=q.link;
            }
        }

        void put (int getcount,int putnumber){
            Elem q = new Elem();
            q=head;
            count=1;
            while (q.link != null){
                if (count== getcount ){
                    q.number = putnumber;
                }
                q=q.link;
                ++count;

            }
        }

        void ins (int getposition, int insnumber){
            Elem q = new Elem();
            q=head;
            count=1;
//                if (head!=tail){      // добавляет в начало, но не работает.
//                    q.link=head;
//                    q.number=insnumber;
//                    head =q;
//                    count++;
//                }
            while (q.link!=null){
                if (count == (getposition-1)){
                    Elem qq = new Elem();
                    qq.link =q.link;
                    qq.number=insnumber;
                    q.link = qq;
                }
                q=q.link;
                count++;
            }
        }





//        void  remove(int rem){             // не работает
//            Elem q = new Elem();
//            q=head;
//            count=0;
//            while (q.link!=null){
//                q=q.link;
//                count++;
//                if (count==(rem-1)){
//                    q.link=q.link.link;
//                    count--;
//                }
//
//            }
//        }








    }
    public static void main (String [] args){

        MyArray q = new MyArray();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        q.del(20);
        q.ins(4,12);
//        q.remove(5);


        q.put(3,66666);
        q.print();
        q.length();
        q.getElem(30);

    }
}


