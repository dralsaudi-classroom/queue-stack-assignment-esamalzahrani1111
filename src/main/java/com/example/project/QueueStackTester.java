package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
       // throw new UnsupportedOperationException("Not supported yet.");
        // Write the recursive static method split that splits a queue of n elements into two
        // queues. The elements with odd orders (i.e. 1st, 3rd, 5th ...) should be put in the
        // first queue and elements with even orders (i.e. 2nd, 4th, 6th ...) should be put in
        // the second queue. The original queue should remain unchanged at the end of the
        // method.
        // Example. Given the queue (A, B, C, D, E), split results in oq (A, C, E), and eq(B, D).
       // for (int i =1; i<=q.length();i++){
          //  T temp = q.serve();
          //   if (i % 2 == 0)
            //    eq.enqueue(temp);
          //  else
          //      oq.enqueue(temp);
          //  q.enqueue(temp);
      //  }
        int j = q.length();
        spliting(q,oq,eq,1,j);
    }
         public static <T> void spliting(Queue<T> q, Queue<T> oq, Queue<T> eq,int i,int j){
        if (i == j+1)
            return;
        T temp = q.serve();
        if (i % 2 ==0)
            eq.enqueue(temp);
        else
            oq.enqueue(temp);
        q.enqueue(temp);
             i++;
        spliting(q,oq,eq,i,j);
        }
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
        throw new UnsupportedOperationException("Not supported yet.");
        // Write a static method remove that removes every element in the priority queue
        // having priority less than p.
        // Example. Given pq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2] remove(pq, 5) results in
        // pq: [A, 10], [D, 8], [B, 5].
    }
    public static <T> boolean search(Stack<T> st, T e)
    {
       
         return sea(st,e);
    }


    public static <T> boolean sea(Stack<T> st,T e){
        T temp = null;
        boolean found = false;
      //  if(!(st.empty()))
      //  {
      // temp = st.pop();
      //  }
       // else {
       //     return false;
      //  }
       //     if (temp == e){
       //         st.push(temp);
       //         return true;
     //               }
    //    else return sea(st,e);
   // }
        if ( !(st.empty()) ){
        temp = st.pop();
        if (temp == e)
            found = true;
        if (found == false)
        found = sea(st,e);
        st.push(temp);
        return found;
            }
        else 
            return false;
}
