/**
 * Copyright (C) 2014-2016 LinkedIn Corp. (pinot-core@linkedin.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linkedin.pinot.core.operator.blocks;

import com.linkedin.pinot.common.utils.DataTable;
import com.linkedin.pinot.core.common.Block;
import com.linkedin.pinot.core.common.BlockDocIdSet;
import com.linkedin.pinot.core.common.BlockDocIdValueSet;
import com.linkedin.pinot.core.common.BlockId;
import com.linkedin.pinot.core.common.BlockMetadata;
import com.linkedin.pinot.core.common.BlockValSet;
import com.linkedin.pinot.core.common.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * InstanceResponseBlock is just a holder to get InstanceResponse from InstanceResponseBlock.
 *
 *
 */
public class InstanceResponseBlock implements Block {
  private static final Logger LOGGER = LoggerFactory.getLogger(InstanceResponseBlock.class);

  private DataTable _instanceResponseDataTable;

  public InstanceResponseBlock(Block block) {
    IntermediateResultsBlock intermediateResultsBlock = (IntermediateResultsBlock) block;
    try {
      _instanceResponseDataTable = intermediateResultsBlock.getDataTable();
    } catch (Exception e) {
      LOGGER.error("Caught exception while building data table.", e);
      throw new RuntimeException("Caught exception while building data table.", e);
    }
  }

  public DataTable getInstanceResponseDataTable() {
    return _instanceResponseDataTable;
  }

  @Override
  public boolean applyPredicate(Predicate predicate) {
    throw new UnsupportedOperationException();
  }

  @Override
  public BlockId getId() {
    throw new UnsupportedOperationException();
  }

  @Override
  public BlockValSet getBlockValueSet() {
    throw new UnsupportedOperationException();
  }

  @Override
  public BlockDocIdValueSet getBlockDocIdValueSet() {
    throw new UnsupportedOperationException();
  }

  @Override
  public BlockDocIdSet getBlockDocIdSet() {
    throw new UnsupportedOperationException();
  }

  @Override
  public BlockMetadata getMetadata() {
    throw new UnsupportedOperationException();
  }
}
