package org.example;

import java.util.ArrayList;
import java.util.Arrays;
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
        String word = s.nextLine();
        System.out.println("뜻 => ");
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

    public void listAll(){
        System.out.println("--------------------");
        for(int i =0; i< list.size(); i++){
            System.out.print((i+1) + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("--------------------");
    }

    public ArrayList<Integer> listAll(String keyword){
        ArrayList<Integer> idlist = new ArrayList<>();
        int j =0;
        System.out.println("--------------------");
        for(int i =0; i< list.size(); i++){
            String word = list.get(i).getWord();
            if(!word.contains(keyword)) continue;

            System.out.print((i+1) + " ");
            System.out.println(list.get(j).toString());
            idlist.add(i);
            j++;
        }
        System.out.println("--------------------");
        return idlist;
    }
    public void updateItem() {
        System.out.println("=> 수정할 단어 검색 : ");
        String keyword = s.next();
        ArrayList<Integer> idlist = this.listAll(keyword);
        System.out.println("=> 수정할 단어의 번호");
        int id = s.nextInt();
        System.out.println("=> 뜻 수정 : ");
        String mean = s.nextLine();
        Word word = list.get(idlist.get(id-1));
        word.setMean(mean);
        System.out.println("단어가 수정되었습니다.");
    }
}
