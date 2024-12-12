import React, { useState } from 'react';
import Header from './components/Header';
import SystemConfig from './components/SystemConfig';
import StatusActivityLog from './components/StatusActivityLog';
import './styles.css';

const App = () => {
  const [systemStatus, setSystemStatus] = useState('STOPPED');
  const [logs, setLogs] = useState([]);
  const [isStopped, setIsStopped] = useState(true); // To toggle STOP and RESET

  // Handles START button click
  const handleStart = () => {
    setSystemStatus('RUNNING');
    setLogs((prevLogs) => [
      ...prevLogs,
      `${new Date().toLocaleTimeString()} - System STARTED`,
    ]);
    setIsStopped(false);
  };

  // Handles STOP button click
  const handleStop = () => {
    setSystemStatus('STOPPED');
    setLogs((prevLogs) => [
      ...prevLogs,
      `${new Date().toLocaleTimeString()} - System STOPPED`,
    ]);
    setIsStopped(true); // Show RESET button
  };

  // Handles RESET button click
  const handleReset = () => {
    setSystemStatus('STOPPED'); // Reset system status
    setLogs([]); // Clear activity log
    setIsStopped(false); // Return STOP button
  };

  return (
    <div className="container">
      <Header />
      <div className="main">
        <SystemConfig
          systemStatus={systemStatus}
          onStart={handleStart}
          onStop={handleStop}
          onReset={handleReset}
          isStopped={isStopped} // Pass STOP/RESET toggle
        />
        <StatusActivityLog systemStatus={systemStatus} logs={logs} />
      </div>
    </div>
  );
};

export default App;
