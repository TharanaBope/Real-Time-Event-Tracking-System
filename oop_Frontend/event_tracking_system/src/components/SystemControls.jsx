import React, { useState } from "react";

function SystemControls({ onStart, onStop }) {
  const [isRunning, setIsRunning] = useState(false);

  const handleStart = () => {
    setIsRunning(true);
    onStart();
  };

  const handleStop = () => {
    setIsRunning(false);
    onStop();
  };

  return (
    <div className="card controls-card">
      <h2>System Controls</h2>
      <button className="btn start" onClick={handleStart} disabled={isRunning}>
        Start System
      </button>
      <button className="btn stop" onClick={handleStop} disabled={!isRunning}>
        Stop System
      </button>
    </div>
  );
}

export default SystemControls;
