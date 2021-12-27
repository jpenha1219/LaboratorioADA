import java.util.*;

public class BankQueue {

    public static void main(String[] args) {
            maxProfit();
    }

    public static void maxProfit() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt();
        long totalCash = 0;
        long soFar = 0;
        PriorityQueue<Person> pq = new PriorityQueue<Person>(N, Collections.reverseOrder());
        
        for (int i = 0; i < N; i++) {
            pq.add(new Person(in.nextInt(), in.nextInt()));
        }
        
        boolean[] select = new boolean[T];
        Person nextPerson;
        while (soFar < N && !pq.isEmpty()) {
            nextPerson = (Person)pq.poll();
            int start = nextPerson.time;
            
            while (start >= 0 && select[start]) {
                start--;
            }
            
            if (start != -1) {
                soFar++;
                select[start] = true;
                totalCash += nextPerson.cash;
            }
        }
        System.out.println(totalCash);  
    }
}

class Person implements Comparable<Person> {
    int cash;
    int time;
    
    public Person(int c, int t) {
        this.cash = c;
        this.time = t;
    }
    
    //@override
    public int compareTo(Person p) {
        int pc = p.cash;
        int pt = p.time;
        
        if (cash < pc) return -1;
        if (cash > pc) return 1;
        if (time < pt) return -1;
        if (time > pt) return 1;
        return 0;
    }
}

