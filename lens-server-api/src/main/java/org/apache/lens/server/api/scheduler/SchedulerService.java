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
package org.apache.lens.server.api.scheduler;

import java.util.List;

import org.apache.lens.api.LensException;
import org.apache.lens.api.LensSessionHandle;
import org.apache.lens.api.ScheduleInfo;
import org.apache.lens.api.ScheduleRunInfo;
import org.apache.lens.api.schedule.*;

/**
 * The Interface SchedulerService.
 */
public interface SchedulerService {
  public static final String NAME = "scheduler";

  /**
   *
   * @param sessionid
   * @param state
   * @param user
   * @param scheduleid
   * @param type
   * @return List of ScheduleHandles
   * @throws LensException
   */
  public List<String> getAllSchedules(LensSessionHandle sessionHandle, String status, String user) throws LensException;

  /**
   *
   * @param sessionid
   * @param scheduleid
   * @return QueryHandle
   * @throws LensException
   */
  public XSchedule getScheduleDefn(LensSessionHandle sessionHandle, String scheduleid) throws LensException;

  /**
   *
   * @param sessionHandle
   * @param scheduleid
   * @return ScheduleInfo object which has detailed info about schedule
   * @throws LensException
   */
  public ScheduleInfo getLensSchedule(LensSessionHandle sessionHandle, String scheduleid) throws LensException;

  /**
   *
   * @param sessionid
   * @param scheduleid
   * @return
   * @throws LensException
   */
  public boolean delete(LensSessionHandle sessionid, String scheduleid) throws LensException;

  /**
   *
   * @param sessionid
   * @param scheduleid
   * @return List of RunHandles for a schedule
   * @throws LensException
   */
  public List<String> getScheduleRuns(LensSessionHandle sessionid, String scheduleid) throws LensException;

  /**
   *
   * @param sessionid
   * @param scheduleid
   * @param runHandle
   * @return Info about a schedule
   * @throws LensException
   */
  public ScheduleRunInfo getScheduleRunDetail(LensSessionHandle sessionid, String scheduleid, String runHandle)
      throws LensException;

  /**
   *
   * @param sessionid
   * @param LensSchedule
   * @return true/false, based of schedule success or not
   * @throws LensException
   */
  public String scheduleTask(LensSessionHandle sessionid, XSchedule schedule) throws LensException;

  /**
   *
   * @param sessionid
   * @param scheduleid
   * @param newLensSchedule
   * @return
   * @throws LensException
   */
  public boolean updateSchedule(LensSessionHandle sessionid, String scheduleid, XSchedule newSchedule)
      throws LensException;

  /**
   *
   * @param sessionid
   * @param scheduleid
   * @param newstatus
   * @return
   * @throws LensException
   */
  public void updateStatus(LensSessionHandle sessionid, String scheduleid, String newstatus) throws LensException;

  /**
   *
   * @param sessionHandle
   * @param scheduleid
   * @param runid
   * @return
   * @throws LensException
   */
  public boolean rerun(LensSessionHandle sessionHandle, String scheduleid, String runid) throws LensException;

}
