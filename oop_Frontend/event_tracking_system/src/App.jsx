import React from "react";
import ParameterForm from "./components/ParameterForm";
import SystemStatus from "./components/SystemStatus";

function App() {
  return (
    <div className="container">
      {/* Header */}
      <header className="welcome-header">
        <h1>Welcome to Real-Time Event Tracking System</h1>
      </header>

      {/* Main Content */}
      <div className="main">
        <ParameterForm />
        <SystemStatus />
      </div>
    </div>
  );
}

export default App;