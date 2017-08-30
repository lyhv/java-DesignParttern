package observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
 private List<NoticeLitsener> mNotices;
 public Observer(){
	 mNotices = new ArrayList<NoticeLitsener>();
 }
 public void addNotices(NoticeLitsener noticeLitsener){
	 mNotices.add(noticeLitsener);
 }
 public void broadcastNotice(String messager){
	 for(NoticeLitsener noticeLitsener: mNotices){
		 noticeLitsener.notification(messager);
	 }
 }
}
