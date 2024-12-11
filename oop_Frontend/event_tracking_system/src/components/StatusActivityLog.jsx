import React, { useState } from 'react';

const StatusActivityLog = ({ systemStatus, logs }) => {
  return (
    <div className="status-activity-card card">
      <div className="status-grid-horizontal">
        <div className="status-item">
          <h3>System Status</h3>
          <p style={{ color: systemStatus === 'STOPPED' ? 'red' : 'green' }}>
            {systemStatus}
          </p>
        </div>
        <div className="status-item">
          <h3>Tickets Available</h3>
          <p>0</p>
        </div>
        <div className="status-item">
          <h3>Active Vendors</h3>
          <p>0</p>
        </div>
        <div className="status-item">
          <h3>Active Customers</h3>
          <p>0</p>
        </div>
      </div>
      <div className="activity-card">
        <h2>Activity Log</h2>
        <div className="log-entries">
          {logs.length === 0 ? (
            <p>No activity to display</p>
          ) : (
            logs.map((log, index) => <p key={index}>{log}</p>)
          )}
        </div>
      </div>
    </div>
  );
};

export default StatusActivityLog;
