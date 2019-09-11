package chapter09.exercises;

public class Chatting {
	void  start(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			void start() {
				while (true) {
					String inputData = "안녕하세요.";
					String msg = nickName + ", " + inputData;
					sendMessage(msg);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
