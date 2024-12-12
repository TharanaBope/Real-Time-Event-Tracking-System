import { Client } from '@stomp/stompjs';

let stompClient = null;

export const connectWebSocket = (onMessageReceived) => {
  // Create a new STOMP client
  stompClient = new Client({
    brokerURL: 'ws://localhost:8080/websocket', // Replace with your backend WebSocket endpoint
    connectHeaders: {},
    debug: (str) => console.log(str),
    reconnectDelay: 5000, // Reconnect after 5 seconds
    onConnect: () => {
      console.log('Connected to WebSocket');

      // Subscribe to a topic (from backend config)
      stompClient.subscribe('/topic/messages', (message) => {
        onMessageReceived(message.body);
      });
    },
    onDisconnect: () => console.log('Disconnected from WebSocket'),
  });

  // Activate the client
  stompClient.activate();
};

export const sendMessage = (message) => {
  if (stompClient && stompClient.connected) {
    stompClient.publish({
      destination: '/app/message', // Endpoint on the backend
      body: message,
    });
  }
};
