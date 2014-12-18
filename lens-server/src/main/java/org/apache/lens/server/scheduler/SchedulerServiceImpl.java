/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.lens.server.scheduler;

import java.util.List;

import org.apache.hive.service.cli.CLIService;
import org.apache.lens.api.LensException;
import org.apache.lens.api.LensSessionHandle;
import org.apache.lens.api.schedule.XSchedule;
import org.apache.lens.api.scheduler.ScheduleInfo;
import org.apache.lens.api.scheduler.ScheduleRunInfo;
import org.apache.lens.server.LensService;
import org.apache.lens.server.api.scheduler.SchedulerService;

/**
 * The Class SchedulerServiceImpl.
 */
public class SchedulerServiceImpl extends LensService implements SchedulerService {

  /**
   * Instantiates a new scheduler service impl.
   *
   * @param cliService
   *          the cli service
   */
  public SchedulerServiceImpl(CLIService cliService) {
    super("scheduler", cliService);
  }

  @Override
  public List<String> getAllSchedules(LensSessionHandle sessionHandle, String status, String user) throws LensException {
    return null;
  }

  @Override
  public XSchedule getScheduleDefn(LensSessionHandle sessionHandle, String scheduleid) throws LensException {
    return null;
  }

  @Override
  public ScheduleInfo getLensSchedule(LensSessionHandle sessionHandle, String scheduleid) throws LensException {
    return null;
  }

  @Override
  public boolean delete(LensSessionHandle sessionid, String scheduleid) throws LensException {
    return false;
  }

  @Override
  public List<String> getScheduleRuns(LensSessionHandle sessionid, String scheduleid) throws LensException {
    return null;
  }

  @Override
  public ScheduleRunInfo getScheduleRunDetail(LensSessionHandle sessionid, String scheduleid, String runHandle)
      throws LensException {
    return null;
  }

  @Override
  public String scheduleTask(LensSessionHandle sessionid, XSchedule schedule) throws LensException {
    return null;
  }

  @Override
  public boolean updateSchedule(LensSessionHandle sessionid, String scheduleid, XSchedule newSchedule)
      throws LensException {
    return false;
  }

  @Override
  public void updateStatus(LensSessionHandle sessionid, String scheduleid, String newstatus) throws LensException {
  }

  @Override
  public boolean rerun(LensSessionHandle sessionHandle, String scheduleid, String runid) throws LensException {
    return false;
  }
}
