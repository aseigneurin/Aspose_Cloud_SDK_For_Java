package com.aspose.cloud.cells;

import java.util.List;

public class ProtectionOptions
{
	private boolean AllowDeletingColumn;
	public boolean getAllowDeletingColumn(){return AllowDeletingColumn;}
	public void setAllowDeletingColumn(boolean AllowDeletingColumn){this.AllowDeletingColumn=AllowDeletingColumn;}

	private boolean AllowDeletingRow;
	public boolean getAllowDeletingRow(){return AllowDeletingRow;}
	public void setAllowDeletingRow(boolean AllowDeletingRow){this.AllowDeletingRow=AllowDeletingRow;}

	private List<String> AllowEditArea;
	public List<String> getAllowEditArea(){return AllowEditArea;}
	public void setAllowEditArea(List<String> AllowEditArea){this.AllowEditArea=AllowEditArea;}

	private boolean AllowFiltering;
	public boolean getAllowFiltering(){return AllowFiltering;}
	public void setAllowFiltering(boolean AllowFiltering){this.AllowFiltering=AllowFiltering;}

	private boolean AllowFormattingCell;
	public boolean getAllowFormattingCell(){return AllowFormattingCell;}
	public void setAllowFormattingCell(boolean AllowFormattingCell){this.AllowFormattingCell=AllowFormattingCell;}

	private boolean AllowFormattingColumn;
	public boolean getAllowFormattingColumn(){return AllowFormattingColumn;}
	public void setAllowFormattingColumn(boolean AllowFormattingColumn){this.AllowFormattingColumn=AllowFormattingColumn;}

	private boolean AllowFormattingRow;
	public boolean getAllowFormattingRow(){return AllowFormattingRow;}
	public void setAllowFormattingRow(boolean AllowFormattingRow){this.AllowFormattingRow=AllowFormattingRow;}

	private boolean AllowInsertingColumn;
	public boolean getAllowInsertingColumn(){return AllowInsertingColumn;}
	public void setAllowInsertingColumn(boolean AllowInsertingColumn){this.AllowInsertingColumn=AllowInsertingColumn;}

	private boolean AllowInsertingHyperlink;
	public boolean getAllowInsertingHyperlink(){return AllowInsertingHyperlink;}
	public void setAllowInsertingHyperlink(boolean AllowInsertingHyperlink){this.AllowInsertingHyperlink=AllowInsertingHyperlink;}

	private boolean AllowInsertingRow;
	public boolean getAllowInsertingRow(){return AllowInsertingRow;}
	public void setAllowInsertingRow(boolean AllowInsertingRow){this.AllowInsertingRow=AllowInsertingRow;}

	private boolean AllowSelectingLockedCell;
	public boolean getAllowSelectingLockedCell(){return AllowSelectingLockedCell;}
	public void setAllowSelectingLockedCell(boolean AllowSelectingLockedCell){this.AllowSelectingLockedCell=AllowSelectingLockedCell;}

	private boolean AllowSelectingUnlockedCell;
	public boolean getAllowSelectingUnlockedCell(){return AllowSelectingUnlockedCell;}
	public void setAllowSelectingUnlockedCell(boolean AllowSelectingUnlockedCell){this.AllowSelectingUnlockedCell=AllowSelectingUnlockedCell;}

	private boolean AllowSorting;
	public boolean getAllowSorting(){return AllowSorting;}
	public void setAllowSorting(boolean AllowSorting){this.AllowSorting=AllowSorting;}

	private boolean AllowUsingPivotTable;
	public boolean getAllowUsingPivotTable(){return AllowUsingPivotTable;}
	public void setAllowUsingPivotTable(boolean AllowUsingPivotTable){this.AllowUsingPivotTable=AllowUsingPivotTable;}
   
    public ProtectionOptions()
    { }
    public ProtectionOptions(boolean allowDeletingColumn, boolean allowDeletingRow, List<String> allowEditArea, boolean allowFiltering, boolean allowFormattingCell, boolean allowFormattingColumn, boolean allowFormattingRow, boolean allowInsertingColumn, boolean allowInsertingHyperlink, boolean allowInsertingRow, boolean allowSelectingLockedCell, boolean allowSelectingUnlockedCell, boolean allowSorting, boolean allowUsingPivotTable)
    {
        AllowDeletingColumn = allowDeletingColumn;
        AllowDeletingRow = allowDeletingRow;
        AllowEditArea = allowEditArea;
        AllowFiltering = allowFiltering;
        AllowFormattingCell = allowFormattingCell;
        AllowFormattingColumn = allowFormattingColumn;
        AllowFormattingRow = allowFormattingRow;
        AllowInsertingColumn = allowInsertingColumn;
        AllowInsertingHyperlink = allowInsertingHyperlink;
        AllowInsertingRow = allowInsertingRow;
        AllowSelectingLockedCell = allowSelectingLockedCell;
        AllowSelectingUnlockedCell = allowSelectingUnlockedCell;
        AllowSorting = allowSorting;
        AllowUsingPivotTable = allowUsingPivotTable;
    }
}
