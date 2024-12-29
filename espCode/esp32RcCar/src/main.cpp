#include <Arduino.h>
#include <WiFi.h>

const char* ssid = "EspRc";
const char* password = "abhiram02";

WiFiServer server(80);

void setup(){
  Serial.begin(9600);
  WiFi.softAP(ssid, password);
  Serial.println("Esp32 hotspot active");

  Serial.println("Ip Address: ");
  Serial.println(WiFi.softAPIP());

  // Start TCP server
  server.begin();
  Serial.println("TCP Server started");
}


void loop() {
  // Check for incoming connections
  WiFiClient client = server.available();
  if (client) {
    Serial.println("Client connected");

    // Read the data sent from the phone
    String request = "";
    while (client.available()) {
      char c = client.read();
      request += c;
    }
    
    // Print the received request
    Serial.println("Received data: ");
    Serial.println(request);
    
    // You can parse the request and control the RC car, etc.
    // For example, if the request is "forward", you can trigger the motor to move forward.
    
    // Send a response to the client
    client.println("HTTP/1.1 200 OK");
    client.println("Content-Type: text/plain");
    client.println();
    client.println("Data received and processed");
    
    client.stop();
    Serial.println("Client disconnected");
  }

  delay(1000);
}
