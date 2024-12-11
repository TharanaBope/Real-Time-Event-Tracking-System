import React, { useState } from "react";

function ActivityLog() {
  const [logs, setLogs] = useState(["No activity to display"]);

  return (
    <div className="card activity-card">
      <h2>Activity Log</h2>
      <div className="log-entries">
        {logs.map((log, index) => (
          <p key={index}>{log}</p>
        ))}
      </div>
    </div>
  );
}

export default ActivityLog;
