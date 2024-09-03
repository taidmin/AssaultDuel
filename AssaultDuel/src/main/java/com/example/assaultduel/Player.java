package com.example.assaultduel;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;

public class Player extends Active{
    private DataInputStream dateIn;//输入流,接收服务器的信息
    private DataOutputStream dateOut;//输出流，发送客户端的信息
    private Socket socket = new Socket();//客户端的套接字
    private ArrayList<String> weapons = new ArrayList<>();//玩家的武器
    private ArrayList<String> legion = new ArrayList<>();//军团
    private String serverMessage;//服务器消息
    private int blood;//角色血量

    private boolean myCamp;//该玩家的阵营
    private String myNumber;//玩家序号，用于确认位置
    private String state;//状态
    private boolean isInGame;//判断是否从游戏里出来
    private String roomInfo;//房间内玩家准备情况
    private String roomNum;//大厅里房间人数情况
    private String selectRoom;//玩家房间选择


    /*
    *函数名：Player
    *作用：连接服务器
    */

    public Player()
    {
        blood = 10000;
        try {
            String ip = "127.0.0.1";//服务器的ip
            InetSocketAddress socketAddress = new InetSocketAddress(ip, 8888);
            this.socket.connect(socketAddress);
            System.out.println("接入成功");//前端可以忽视
            this.dateIn = new DataInputStream(this.socket.getInputStream());
            this.dateOut = new DataOutputStream(this.socket.getOutputStream());
        } catch (IOException e) {
            System.out.println("断开连接");//前端可以忽视
        }
        this.isInGame = false;
        this.selectRoom = "-1";
    }

    /*
     *函数名：injured
     *作用：角色受伤
     */

    public void injured(int amountOfDaamage)
    {
        blood -= amountOfDaamage;
    }

    //写角色的一些操作，比如射击，军队，移动等
}
