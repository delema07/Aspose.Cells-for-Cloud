//
//  Text.h
//  Aspose.Cells
//
//  Created by Muhammad Sohail Ismail on 17/03/2017.
//  Copyright © 2017 Aspose. All rights reserved.
//

#import <Foundation/Foundation.h>
@class ASPCellsApi;

@interface Text : NSObject

@property(nonatomic, strong) ASPCellsApi *cellsApi;

- (void)getWorkBookTextItems;
- (void)getWorkSheetTextItems;
- (void)postWorkSheetTextSearch;
- (void)postWorkbooksTextReplace;
- (void)postWorkbooksTextSearch;
- (void)postWorsheetTextReplace;

@end
