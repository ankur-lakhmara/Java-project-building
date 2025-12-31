package org.dec30.libraryManagement.Services;

import org.dec30.libraryManagement.Model.Member;

import java.util.ArrayList;

public class MemberService {
    ArrayList<Member> members = new ArrayList<Member>();
//    private

    public boolean addMember(int id, String name){
        for(int i = 0;i<members.size();i++){
            if(members.get(i).getId() == id){
                return false;
            }
        }
        members.add(new Member(id,name));
        return true;
    }

    public boolean isMemberExist(int id){
        for(int i = 0;i<members.size();i++){
            if(members.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Member> getAllMembers(){
        return members;
    }
}
