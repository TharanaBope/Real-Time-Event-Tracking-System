import React from "react";
import ActivityLog from "./ActivityLog";

function SystemStatus() {
  return (
    <div className="card status-activity-card">
      <h2>Current Status & Activity Log</h2>
      <div className="status-grid-horizontal">
        <div className="status-item">
          <h3>System Status</h3>
          <p className="status stopped">STOPPED</p>
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
      <ActivityLog />
    </div>
  );
}

export default SystemStatus;