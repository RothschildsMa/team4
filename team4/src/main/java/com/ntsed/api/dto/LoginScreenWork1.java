package com.ntsed.api.dto;

import java.util.Scanner;

/*
 * author:Feng
 * date:  2023/12/08
*/

public class LoginScreenWork1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  Username = "UserID";
        String  Password = "pass";

        System.out.println("社員IDを入力してください");
        String inputUsername = scanner.nextLine();


        System.out.println("パスワードを入力してください");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(Username) && inputPassword.equals(Password) ){
            System.out.println("ログインは成功！");
        }else if (!inputUsername.equals("UserID") && (inputPassword.equals("pass"))){
            System.out.println("社員IDが存在しません。");
        }else if (inputUsername.equals("UserID") && (!inputPassword.equals("pass"))){
            System.out.println("パスワードが間違っています。再度入力しなおしてください。");
        }
        else{
            System.out.println("社員IDとパスワードが間違っています。");
        }
        scanner.close();
    }
}
										