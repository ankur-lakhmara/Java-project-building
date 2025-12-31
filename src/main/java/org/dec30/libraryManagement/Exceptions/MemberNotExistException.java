package org.dec30.libraryManagement.Exceptions;

public class MemberNotExistException extends RuntimeException{
    public MemberNotExistException(int memberId){
        super("Member id " +memberId+ " Not Exist");
    }
}
