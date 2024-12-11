import React, { useState } from 'react';
import Header from './components/Header';
import SystemConfig from './components/SystemConfig';
import StatusActivityLog from './components/StatusActivityLog';
import './styles.css';

const App = () => {
  const [systemStatus, setSystemStatus] = useState('STOPPED');
  const [logs, setLogs] = useState([]);

  const handleStartStop = () => {
    const newStatus = systemStatus === 'STOPPED' ? 'RUNNING' : 'STOPPED';
    setSystemStatus(newStatus);
    setLogs((prevLogs) => [
      ...prevLogs,
      `${new Date().toLocaleTimeString()} - System ${newStatus}`,
    ]);
  };

  return (
    <div className="container">
      <Header />
      <div className="main">
        <SystemConfig onStartStop={handleStartStop} systemStatus={systemStatus} />
        <StatusActivityLog systemStatus={systemStatus} logs={logs} />
      </div>
    </div>
  );
};

export default App;
