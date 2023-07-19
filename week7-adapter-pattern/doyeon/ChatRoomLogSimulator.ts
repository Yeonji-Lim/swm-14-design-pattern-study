import ACrew from "./ACrew";
import BDirect from "./BDirect";
import CrewChatRoom from "./CrewChatRoom";
import DirectChatRoomAdapter from "./DirectChatRoomAdapter";

function testChatRoomLog(chatRoom: CrewChatRoom): void {
  chatRoom.create();
  chatRoom.join("홍길동");
  chatRoom.sendMessage("홍길동", "안녕하세요");
}

const chatRoomA = new ACrew();

testChatRoomLog(chatRoomA);

const chatRoomB = new BDirect();
const directAdaptor = new DirectChatRoomAdapter(chatRoomB);

testChatRoomLog(directAdaptor);
