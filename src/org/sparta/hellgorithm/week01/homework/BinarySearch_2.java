package org.sparta.hellgorithm.week01.homework;

import java.util.Scanner;

public class BinarySearch_2 {
    static int binSearch(int[] a, int n , int key) {
        int pl = 0;
        int pr = n -1;

        do {
            int pc = (pl + pr) / 2;
            print(n,pl,pr,pc,a);
            if ( a[pc] == key ) {
                return pc;
            }
            else if ( a[pc] < key ) {
                pl = pc + 1;
            }
            else if ( a[pc] > key ) {
                pr = pc - 1;
            }
        } while ( pl <= pr );

        return -1;
    }
    static void print(int n,int pl,int pr,int pc, int[] a){
        System.out.print("\t\t\t\t\t\t\t");
        for(int i=0; i<n; i++){
            if(i==pl)
                System.out.print("<-\t");
            else if(i==pr)
                System.out.print("->\t");
            else if(i==pc)
                System.out.print("+\t");
            else
                System.out.print(" \t");
        }
        System.out.println();
        System.out.print("���� ��ȸ �ε���: "+pc+"\t\t\t");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("��� ��");
        int num = stdIn.nextInt();

        int[] x = new int[num];
        System.out.println("������������ �Է��ϼ���.");
        x[0] = stdIn.nextInt();
        for ( int i = 1; i < num; i++ ) {
            do {
                System.out.println("x[ " + i + "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i-1]);
        }

        System.out.println("�˻��� �� : ");
        int ky = stdIn.nextInt();

        int idx = binSearch(x, num, ky);

        if ( idx == -1 ) {
            System.out.println("�� ���� ��Ұ� �����ϴ�.");
        }
        else if ( idx != -1 ){
            System.out.println(ky + "��[��] x[" + idx + " ]�� �ֽ��ϴ�.");
        }
    }
}