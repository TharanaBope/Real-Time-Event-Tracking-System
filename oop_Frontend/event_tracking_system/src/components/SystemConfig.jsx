import React from 'react';

const SystemConfig = ({ systemStatus, onStart, onStop, onReset, isStopped }) => {
  return (
    <div className="parameter-card card">
      {/* Form inputs */}
      <label>Total Tickets</label>
      <input type="number" placeholder="Enter total tickets" />
      <label>Release Rate</label>
      <input type="number" placeholder="Enter release rate" />
      <label>Retrieval Rate</label>
      <input type="number" placeholder="Enter retrieval rate" />
      <label>Max Capacity</label>
      <input type="number" placeholder="Enter max capacity" />
      <label>Vendors</label>
      <input type="number" placeholder="Enter vendors" />
      <label>Customers</label>
      <input type="number" placeholder="Enter customers" />

      {/* START button (always visible) */}
      <button className="btn start" onClick={onStart}>
        START
      </button>

      {/* STOP or RESET button */}
      {isStopped ? (
        <button className="btn stop" onClick={onReset}>
          RESET
        </button>
      ) : (
        <button className="btn stop" onClick={onStop}>
          STOP
        </button>
      )}
    </div>
  );
};

export default SystemConfig;
