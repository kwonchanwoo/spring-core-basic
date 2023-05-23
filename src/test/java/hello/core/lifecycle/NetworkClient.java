package hello.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient{

    private String url;


    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
        connect();
        call("초기화 연결 메시지");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //service start
    public void connect() {
        System.out.println("connect : " + url);
    }

    public void call(String message) {
        System.out.println("call : " + url + "message :" + message);
    }

    //service end
    public void disconnect() {
        System.out.println("close : " + url);
        
    }

    @PostConstruct
    public void init(){
        System.out.println("NetworkClient.start");
    }
    @PreDestroy
    public void close(){
        System.out.println("NetworkClient.close");
    }

    // 의존관계 주입이 끝나면 호출해주겠다는 의미
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("NetworkCLient.afterPropertiesSet");
//        connect();
//        call("초기화 연결 메시지");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//
//        disconnect();
//
//    }
}
