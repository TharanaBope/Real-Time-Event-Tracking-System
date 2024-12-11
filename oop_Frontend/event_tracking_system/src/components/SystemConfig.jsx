import React, { useState } from 'react';

const SystemConfig = ({ onStartStop, systemStatus }) => {
  const [config, setConfig] = useState({
    totalTickets: '',
    releaseRate: '',
    retrievalRate: '',
    maxCapacity: '',
    vendors: '',
    customers: '',
  });

  const handleInputChange = (e) => {
    setConfig({ ...config, [e.target.name]: e.target.value });
  };

  const handleButtonClick = () => {
    onStartStop();
  };

  return (
    <div className="parameter-card card">
      <label>Total Tickets</label>
      <input
        type="number"
        name="totalTickets"
        value={config.totalTickets}
        onChange={handleInputChange}
      />
      <label>Release Rate</label>
      <input
        type="number"
        name="releaseRate"
        value={config.releaseRate}
        onChange={handleInputChange}
      />
      <label>Retrieval Rate</label>
      <input
        type="number"
        name="retrievalRate"
        value={config.retrievalRate}
        onChange={handleInputChange}
      />
      <label>Max Capacity</label>
      <input
        type="number"
        name="maxCapacity"
        value={config.maxCapacity}
        onChange={handleInputChange}
      />
      <label>Vendors</label>
      <input
        type="number"
        name="vendors"
        value={config.vendors}
        onChange={handleInputChange}
      />
      <label>Customers</label>
      <input
        type="number"
        name="customers"
        value={config.customers}
        onChange={handleInputChange}
      />
      <button
        className={`btn ${systemStatus === 'STOPPED' ? 'stop' : 'start'}`}
        onClick={handleButtonClick}
      >
        {systemStatus === 'STOPPED' ? 'Reset' : 'Start System'}
      </button>
    </div>
  );
};

export default SystemConfig;
