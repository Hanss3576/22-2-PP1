package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
    ArrayList<Word> list;
    Scanner s;


    public WordCRUD(Scanner s) {
        list = new ArrayList<Word>();
        this.s = s;
    }

    @Override
    public Object add() {
        System.out.println("=> 난이도(1-2-3) & 단어 입력 : ");
        int level = s.nextInt();
        String word = s.next();
        System.out.println("뜻  :  ");
        String m = s.nextLine();

        return new Word(0, level, word, m);
    }
    public void addWord(){
        Word one = (Word)add();
        list.add(one);
        System.out.println("추가되었습니다 \n");
    }
    @Override
    public int udpate(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }
}
