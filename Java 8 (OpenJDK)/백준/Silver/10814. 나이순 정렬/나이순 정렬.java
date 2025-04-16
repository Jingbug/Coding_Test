import java.io.*;
import java.util.*;

class Member {
    int id;
    int age;
    String name;

    public Member(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];
        List<Member> memberList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String string = br.readLine();
            members[i] = new Member(i, Integer.parseInt(string.split(" ")[0]), string.split(" ")[1]);
            memberList.add(members[i]);
        }

        Collections.sort(memberList, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                if (m1.age < m2.age) return -1;
                return m1.age == m2.age ? 0 : 1;
            }
        });

        for (Member member : memberList) {
            bw.write(String.format("%d %s\n", member.age, member.name));
        }
        bw.flush();
        bw.close();
    }
}
